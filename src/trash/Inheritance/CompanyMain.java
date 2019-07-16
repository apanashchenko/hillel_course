package trash.Inheritance;

public class CompanyMain {
    public static void main(String[] args) {
        Company defaultCompany = new Company("DefaultCompany", "Metal seller", 50,"Kiyv");

        defaultCompany.companyIntro();
        defaultCompany.startWorkTime();

        System.out.println("=====================");
        KumysCompany kumysCompany = new KumysCompany("Kumys LTD", "Alcohol seller", 100,"Dnipro");

        kumysCompany.companyIntro();
        kumysCompany.startWorkTime();

        System.out.println("=====================");
        ItCompany itCompany = new ItCompany("Kumys LTD", "Alcohol seller", 100,"Dnipro");

        itCompany.companyIntro();
        itCompany.startWorkTime();
    }
}
