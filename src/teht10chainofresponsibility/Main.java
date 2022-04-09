package teht10chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        Javacoder jasper = new Javacoder(2000);
        Teamleader teppo = new Teamleader();
        TeamTeamleader timo = new TeamTeamleader();
        CEO simo = new CEO();
        teppo.setNextCoordinator(timo);
        timo.setNextCoordinator(simo);
        System.out.println(jasper.getPay() + "€");
        jasper.demandPayRaise(teppo, 1.01);
        System.out.println(jasper.getPay() + "€");
        jasper.demandPayRaise(teppo, 1.05);
        System.out.println(jasper.getPay() + "€");
        jasper.demandPayRaise(teppo, 1.5);
        System.out.println(jasper.getPay() + "€");
        jasper.demandPayRaise(teppo, 3);
        System.out.println(jasper.getPay() + "€");
    }
}
