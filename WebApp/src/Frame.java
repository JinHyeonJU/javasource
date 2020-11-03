import java.awt.Dimension;

import javax.swing.JFrame;

public class Frame {
	public static void main(String[] args) {
		JFrame frame = new JFrame() ;
		
		frame.setResizable(false); //GUI창 크기 조정 가능유무
		frame.setVisible(true); //GUI창을 보이게한다
		frame.setPreferredSize(new Dimension(840, 840/12*9)); //GUI창 비율 설정
		frame.setSize(840, 840/12*9); //GUI창 크기 설정
		frame.setLocationRelativeTo(null); //어디에서 GUI를 실행시킬것인지, null하면 중간에서 실행
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프로그램 껐을때 모든게 종료
	}
}
