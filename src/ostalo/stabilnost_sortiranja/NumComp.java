package ostalo.stabilnost_sortiranja;

import java.util.Comparator;

public class NumComp implements Comparator<Element> {

	@Override
	public int compare(Element o1, Element o2) {
		return o1.num - o2.num;
	}
}
