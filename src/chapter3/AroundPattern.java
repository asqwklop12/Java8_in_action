package chapter3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AroundPattern {

	// 실행하라면 data.txt의 내용혹은 이름을 바꿔야함... 
	public static void main(String[] args) throws IOException {

		// 1단계
		String result = processFile((BufferedReader br) ->
									br.readLine() + br.readLine());
		
		// 4단계
		String outLine = 
				processFile((BufferedReader br) -> 
								br.readLine());
		
		String twoLine = 
				processFile((BufferedReader br) -> 
								br.readLine() + br.readLine());
	}

	// 준비
	public static String processFile(BufferedReaderProcessor p) 
			throws IOException {
		try (BufferedReader br = 
				new BufferedReader(new FileReader("data.txt"))) {
			// 3단계
			return p.process(br);
		}
	}
}

// 2단계
interface BufferedReaderProcessor {
	String process(BufferedReader b) throws IOException;
}