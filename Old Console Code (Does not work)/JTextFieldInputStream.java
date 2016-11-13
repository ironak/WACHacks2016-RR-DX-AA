import java.io.IOException;
import java.io.InputStream;
import java.awt.event.*;
import javax.swing.JTextField;


public class JTextFieldInputStream extends InputStream {
    byte[] contents;
    int pointer = 0;

    public JTextFieldInputStream(final JTextField text) {

        text.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if(e.getKeyChar()=='\n'){
                    contents = text.getText().getBytes();
                    pointer = 0;
                    //text.setText("");
                }
                super.keyReleased(e);
            }
        });
    }

    @Override
    public int read() throws IOException {
        if(pointer >= contents.length) return 1;
        return this.contents[pointer++];
    }

}