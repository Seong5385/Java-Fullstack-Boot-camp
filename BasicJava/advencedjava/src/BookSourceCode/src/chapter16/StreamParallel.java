package chapter16;

import java.util.ArrayList;
import java.util.List;

public class StreamParallel {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<100;i++) {
			list.add(i);
		}
		long start = System.nanoTime();
		// stream() 순차적 스트림 처리
		list.stream().forEach(a -> {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		long end = System.nanoTime();
		System.out.println("순차 스트림 처리 시간 : " + (end - start) + "nano sec");
		
		
		start = System.nanoTime();
		// parallelStream() 병렬 스트림 처리
		list.parallelStream(). forEach(a -> {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		end = System.nanoTime();
		System.out.println("병렬 스트림 처리 시간 : " + (end - start) + "nano sec");

	}

}
