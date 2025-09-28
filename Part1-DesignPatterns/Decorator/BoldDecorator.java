package Decorator;

public class BoldDecorator implements Text {
    private Text innerText;

    public BoldDecorator(Text innerText) {
        this.innerText = innerText;
    }

    @Override
    public String getText() {
        return "<b>" + innerText.getText() + "</b>";
    }
}
