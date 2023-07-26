package p2023_07_26;

//그래픽 관련 예시(ColorEvent, FrameTest, FrameTestEx)

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameTest {
	
    private Frame f;

    public FrameTest() {	
		f = new Frame( "Frame Test" );	
		f.setSize( 400, 300 );
		f.setLocation( 100, 100 );
		f.setBackground( Color.green );
		f.setVisible( true );
		f.setResizable(false);    

	f.addWindowListener( new WindowAdapter() {
		    public void windowClosing( WindowEvent e ) {
				System.exit( 0 );
		    }
    });

	}//생성자 end

    public static void main( String[] args ) {
		FrameTest ft = new FrameTest();
    }
}