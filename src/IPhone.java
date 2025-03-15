public class IPhone implements Phone, IPad, Browser {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        iPhone.call("123-456-7890");
        iPhone.answer();
        iPhone.voiceMail();
        iPhone.play();
        iPhone.pause();
        iPhone.selectMusic();
        iPhone.showPage("www.apple.com");
        iPhone.newTab("www.huawei.com");
        iPhone.refreshPage();
    }

    @Override
    public void call(String number) {
        System.out.println("Calling " + number);
    }

    @Override
    public void answer() {
        System.out.println("Answering the call");
    }

    @Override
    public void voiceMail() {
        System.out.println("Calling voice mail");
    }

    @Override
    public void play() {
        System.out.println("Playing music");
    }

    @Override
    public void pause() {
        System.out.println("Pausing music");
    }

    @Override
    public void selectMusic() {
        System.out.println("Selecting music");
    }
    
    @Override
    public void showPage(String url) {
        System.out.println("Showing page " + url);
    }

    @Override
    public void newTab(String url) {
        System.out.println("Opening new tab with page " + url);
    }

    @Override
    public void refreshPage() {
        System.out.println("Refreshing page");
    }
}
