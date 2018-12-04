package fr.unilim.iut.kebabvisitor.ingredients;

import fr.unilim.iut.kebabvisitor.Kebab;
import visitor.VisiteurDeRegime;

public class Salade extends Ingredient {

	public Salade(String nom, Kebab kebab) {
		super(nom, kebab);
	}

	@Override
	public boolean isVegetarien() {
		return super.isVegetarien();
	}

	@Override
	public boolean isPescetarien() {
		return super.isPescetarien();
	}
	
	public void accept(VisiteurDeRegime v) {
		v.accept(this);
	}

}
