public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        FindMedianFromDataStream findMedianFromDataStream = new FindMedianFromDataStream();
        findMedianFromDataStream.addNum(3);
        findMedianFromDataStream.addNum(2);
        findMedianFromDataStream.addNum(7);
        findMedianFromDataStream.addNum(4);

        System.out.println(findMedianFromDataStream.getMedian());
    }
}