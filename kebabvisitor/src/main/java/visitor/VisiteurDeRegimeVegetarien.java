package visitor;

import fr.unilim.iut.kebabvisitor.Assiette;
import fr.unilim.iut.kebabvisitor.ingredients.Agneau;
import fr.unilim.iut.kebabvisitor.ingredients.Boeuf;
import fr.unilim.iut.kebabvisitor.ingredients.Crevette;
import fr.unilim.iut.kebabvisitor.ingredients.Fromage;
import fr.unilim.iut.kebabvisitor.ingredients.Oignon;
import fr.unilim.iut.kebabvisitor.ingredients.Pain;
import fr.unilim.iut.kebabvisitor.ingredients.Salade;
import fr.unilim.iut.kebabvisitor.ingredients.Sauce;
import fr.unilim.iut.kebabvisitor.ingredients.Thon;
import fr.unilim.iut.kebabvisitor.ingredients.Tomate;

public class VisiteurDeRegimeVegetarien {
	
	public boolean visit(Agneau IngredientAgneau) {
		return false;
	}
	
	public boolean visit(Boeuf IngredientBoeuf) {
		return false;
	}
	
	public boolean visit(Crevette IngredientCrevette) {
		return false;
	}
	
	public boolean visit(Fromage IngredientFromage) {
		return true;
	}
	
	public boolean visit(Oignon IngredientOignon) {
		return true;
	}
	
	public boolean visit(Pain IngredientPain) {
		return true;
	}
	
	public boolean visit(Salade IngredientSalade) {
		return true;
	}
	
	public boolean visit(Sauce IngredientSauce) {
		return true;
	}
	
	public boolean visit(Thon IngredientThon) {
		return false;
	}
	public boolean visit(Tomate IngredientTomate) {
		return true;
	}
	
	public boolean visit(Assiette IngredientAssiette) {
		return true;
	}
}
