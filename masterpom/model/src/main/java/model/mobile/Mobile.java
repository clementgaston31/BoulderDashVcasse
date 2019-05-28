package model.mobile;

import contract.model.IMobile;
import fr.exia.showboard.IBoard;
import model.element.Element;

public abstract class Mobile extends Element implements IMobile {

	
	/** The board. */
    private IBoard  board;
}
