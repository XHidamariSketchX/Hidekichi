package com.xhidamarisketchx.acg;
interface Foodaholic{
	public void eat(Object obj);
}
interface Yuri{
	public void yuri(Hidekichi xx);
}
interface Ninshinable{
	public void ninshin(Object obj);
}
interface deliverable{
	public Hidekichi delivery();
}
interface FFF{
	public void fff(Male m,Hidekichi h);
}
abstract class humanbeing{
	Object obj;
	public humanbeing(){}
	public humanbeing (Object obj){this.obj=obj;}
	public Object getObj() {return obj;}
}
abstract class Hidekichi extends humanbeing implements Yuri, Ninshinable{
	public Hidekichi(){}
	public Hidekichi(Object obj) {super(obj);}
	public abstract void ninshin(Object obj);
	public abstract void yuri(Hidekichi xx);

}
class Futa extends Hidekichi implements deliverable{
	private Object oppai;
	private Hidekichi baby;
	private Object chinChin;
	public Futa(){}
	public Futa(Object obj) {super(obj);}
	public Hidekichi delivery() {
		return baby;
	}
	public void ninshin(Object obj) {
		baby=new Futa(obj);
	}
	public void yuri(Hidekichi xx) {
		this.ninshin(xx.getObj());
	}
}
class Otokonoko extends Hidekichi {
	private Hidekichi baby;
	private Object chinChin;
	public Otokonoko(){}
	public Otokonoko(Object obj){super(obj);}
	public void ninshin(Object obj){
		baby=new Otokonoko(obj);
	}
	public void yuri(Hidekichi xx){
		this.ninshin(xx.getObj());
	}
}
class Female extends Hidekichi implements deliverable{
	private Object oppai;
	private Hidekichi baby;
	public Female(){}
	public Female(Object obj){super(obj);}
	public Hidekichi delivery() {
		return baby;
	}
	public void ninshin(Object obj) {
		baby=new Female(obj);
	}
	public void yuri(Hidekichi xx) {
		this.ninshin(xx.getObj());
	}
}
class Male implements FFF{
	private Object chinChin;
	private Object gas,lighter;
	@Override
	public void fff(Male m, Hidekichi h) {
		//TBD
	}
}
public class ThisWorld {
	public static void main(String[] args) {
		Male m111=new Male();
		Male hentai=new Male();
		//some thing happened
		Female sisPop=new Female();
		Futa cutefuta=new Futa();
		//some thing happened to hentai sisPop
		m111.fff(hentai,sisPop);
		//some thing happened
		sisPop.yuri(cutefuta);
		Female loli= (Female)sisPop.delivery();
		//some thing happened to hentai loli
		for(int i=0;i<100;i--)
			m111.fff(hentai, loli);
		Otokonoko cuteBoy=new Otokonoko();
		//some thing happened to loli cuteBoy
		cuteBoy.yuri(loli);
		//some thing can not happen
	}
}
