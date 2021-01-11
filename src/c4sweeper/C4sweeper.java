package c4sweeper;

import javax.swing.JOptionPane;

public class C4sweeper {

    public void start(C4sweeper c4sweeper) {
        Input = new input(c4sweeper);
        Input.main(Input);
    }

    public void proceed(int size) {
        int toughness = 1;
        Object[] options = {"Mudah", "Sedang", "Susah"};
        toughness = JOptionPane.showOptionDialog(null,
                "Seberapa tangguh anda?", "Tingkat Kesulitan",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[1]);
        if(toughness == -1)
            System.exit(0);
        newGame = new game(size, toughness);
        newGame.main(newGame, size);

    }

    public static void main(String[] args) {
        c4sweeper = new C4sweeper();
        c4sweeper.start(c4sweeper);
    }

    private static C4sweeper c4sweeper;
    private static game newGame;
    private static input Input;
}

