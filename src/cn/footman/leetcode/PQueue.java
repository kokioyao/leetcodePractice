package cn.footman.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author footman77
 * @create 2018-11-28 23:14
 */
public class PQueue {

    public static void main(String[] args) {
        // 默认的PriorityQueue, 底层是最小堆
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < 10; i++){
            int num = (int)(Math.random() * 100);
            pq.add(num);
            System.out.println("insert " + num + " in priority queue. ");
        }

        while (!pq.isEmpty()){
            System.out.println(pq.poll() + "");
        }

        System.out.println("===============");


        PriorityQueue<Integer> pq2 = new PriorityQueue<>(10, (x, y) -> y - x);

        for(int i = 0; i < 10; i++){
            int num = (int)(Math.random() * 100);
            pq2.add(num);
            System.out.println("insert " + num + " in priority queue2. ");
        }

        while (!pq2.isEmpty()){
            System.out.println(pq2.poll() + "");
        }


        System.out.println("===========");

        // 使用自定义的Comparator，创建个性化的PriorityQueue
        // 注意：也可以使用lambda表达式。在这里只是为了演示PriorityQueue的不同用法
        // 同理，上一个例子也可以使用自定义的Comparator的方式完成
        class myCmp implements Comparator<Integer> {
            @Override
            public int compare(Integer a, Integer b){
                if(a%10 != b%10)
                    return a%10 - b%10;
                return a - b;
            }
        }
        PriorityQueue<Integer> pq3 = new PriorityQueue<Integer>(10, new myCmp());

        for(int i = 0 ; i < 10 ; i ++){
            int num = (int)(Math.random() * 100);
            pq3.add(num);
            System.out.println("insert " + num + " in priority queue.");
        }

        while (!pq3.isEmpty())
            System.out.print(pq3.poll() + " ");


    }

}
