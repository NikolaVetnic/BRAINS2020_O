package ostalo.prosti_referencijalni_tipovi;

public class Prosti_Referncijalni {

	
	public static void main(String[] args) {
		
		// lokalna klasa - isto kao i "redovna" samo definisana u bloku i vidljiva samo unutar bloka
		class KlasaSaPoljimaKojaSuProstiTipovi {
			
			private int x;
			
			public KlasaSaPoljimaKojaSuProstiTipovi(int x) {
				this.x = x;
			}
			
			public int x() 			{ return x; 	}
			public void setX(int x) { this.x = x; 	}
			
			public void stampaj() {
				System.out.println("Kod mene vrednost promenljive x je : " + x);
			}
		}
		
		// jos jedna lokalna klasa
		class KlasaSaPoljimaKojaSuReferencijalniTipovi {
			
			private KlasaSaPoljimaKojaSuProstiTipovi x;
			
			public KlasaSaPoljimaKojaSuReferencijalniTipovi(int x) {
				this.x = new KlasaSaPoljimaKojaSuProstiTipovi(x);
			}
			
			public KlasaSaPoljimaKojaSuReferencijalniTipovi(KlasaSaPoljimaKojaSuProstiTipovi x) {
				this.x = x;
			}
			
			public void inc() {
				this.x.setX(this.x.x() + 1);
			}
			
			public void stampaj() {
				System.out.println("Kod mene vrednost promenljive x je : " + x.x());
			}
		}
		
		int x = 1;
		
		System.out.println("PROSTI TIPOVI\n");
		
		// svaka instanca sadrzi svoju kopiju ulaznog parametra iako je isti parametar u pitanju
		KlasaSaPoljimaKojaSuProstiTipovi a = new KlasaSaPoljimaKojaSuProstiTipovi(x);
		KlasaSaPoljimaKojaSuProstiTipovi b = new KlasaSaPoljimaKojaSuProstiTipovi(x);
		KlasaSaPoljimaKojaSuProstiTipovi c = new KlasaSaPoljimaKojaSuProstiTipovi(x);
		
		a.stampaj();	b.stampaj();	c.stampaj();
		System.out.println();
		
		// promene parametra u jednoj instanci ne uticu ne isti parametar u drugoj (svaka ima svoju kopiju) 
		a.setX(0);		b.setX(2);		
		a.stampaj();	b.stampaj();	c.stampaj();
		System.out.println();
		
		System.out.println("REFERENCIJALNI TIPOVI\n");
		
		// svaka instanca sadrzi svoju kopiju REFERENCE na ISTU instancu klase koja je ulazni parametar
		KlasaSaPoljimaKojaSuReferencijalniTipovi aa = new KlasaSaPoljimaKojaSuReferencijalniTipovi(a);
		KlasaSaPoljimaKojaSuReferencijalniTipovi bb = new KlasaSaPoljimaKojaSuReferencijalniTipovi(a);
		KlasaSaPoljimaKojaSuReferencijalniTipovi cc = new KlasaSaPoljimaKojaSuReferencijalniTipovi(a);
		
		aa.stampaj();	bb.stampaj();	cc.stampaj();
		System.out.println();
		
		// promena na bilo kojoj instanci utice i na ostale buduci da polje klase kod sve tri referencira isti objekat
		aa.inc();		bb.inc();		cc.inc();
		aa.stampaj();	bb.stampaj();	cc.stampaj();
		System.out.println();
		
		// ovde unutar konstruktora kreiramo sopstvene instance klase koja je polje klase - najbolji nacin
		KlasaSaPoljimaKojaSuReferencijalniTipovi aaa = new KlasaSaPoljimaKojaSuReferencijalniTipovi(0);
		KlasaSaPoljimaKojaSuReferencijalniTipovi bbb = new KlasaSaPoljimaKojaSuReferencijalniTipovi(4);
		KlasaSaPoljimaKojaSuReferencijalniTipovi ccc = new KlasaSaPoljimaKojaSuReferencijalniTipovi(9);
		
		aaa.stampaj();	bbb.stampaj();	ccc.stampaj();
		System.out.println();
		
		// sada dobijamo ponasanje koje smo ocekivali
		aaa.inc();		bbb.inc();		ccc.inc();
		aaa.stampaj();	bbb.stampaj();	ccc.stampaj();
		System.out.println();
	}
}
