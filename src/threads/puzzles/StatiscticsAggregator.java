package threads.puzzles;

public interface StatiscticsAggregator {

	void putNewPrice(String symbol, double price);

	double getAveragePrice(String symbol);

	int getTickCount(String symbol);

}
