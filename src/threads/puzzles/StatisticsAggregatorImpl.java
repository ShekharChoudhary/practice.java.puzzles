package threads.puzzles;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public class StatisticsAggregatorImpl implements StatiscticsAggregator{

	ConcurrentHashMap<String, ArrayList<Double>> symbolPriceHash = new ConcurrentHashMap<String, ArrayList<Double>>();
	ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	private WriteLock writeLock = lock.writeLock();
	private ReadLock readLock = lock.readLock();
			
	
	@Override
	public void putNewPrice(String symbol, double price) {

		writeLock.lock();
		ArrayList<Double> array = symbolPriceHash.get(symbol);
		try {
			if(array == null)
			{
				array = new ArrayList<Double>();
				symbolPriceHash.put(symbol, array);
			}
			array.add(price);
		} 
		finally
		{
			writeLock.unlock();
		}
	}

	@Override
	public double getAveragePrice(String symbol) {
		readLock.lock();
		try{
			return(symbolPriceHash.get(symbol).stream().reduce(Double :: sum).get());
		}finally
		{
			readLock.unlock();
		}
	}

	@Override
	public int getTickCount(String symbol) {
		readLock.lock();
		try
		{
			return(symbolPriceHash.size());
		}
		finally
		{
			readLock.unlock();
		}
	}
}
