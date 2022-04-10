package teht12proxy;

import java.util.ArrayList;

class ProxyExample {
    /**
     * Test method
     */
    public static void main(final String[] arguments) {
        ArrayList<ProxyImage> valokuvakansio = new ArrayList<>();
        valokuvakansio.add(new ProxyImage("HiRes_10MB_Photo1"));
        valokuvakansio.add(new ProxyImage("HiRes_10MB_Photo2"));
        valokuvakansio.add(new ProxyImage("LowRes_10MB_Photo3"));

        for (ProxyImage valokuva : valokuvakansio) {
            valokuva.showData();
        }
        for (ProxyImage valokuva : valokuvakansio) {
            valokuva.displayImage();
        }
    }
}