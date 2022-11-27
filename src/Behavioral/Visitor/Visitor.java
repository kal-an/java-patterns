package Behavioral.Visitor;

import Behavioral.Visitor.impl.Circle;
import Behavioral.Visitor.impl.CompoundShape;
import Behavioral.Visitor.impl.Dot;
import Behavioral.Visitor.impl.Rectangle;

public interface Visitor {

    void visitDot(Dot dot);
    void visitCircle(Circle circle);
    void visitRectangle(Rectangle rectangle);
    void visitCompoundGraphic(CompoundShape shape);
}
