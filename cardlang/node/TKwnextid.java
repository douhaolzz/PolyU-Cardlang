/* This file was generated by SableCC (http://www.sablecc.org/). */

package cardlang.node;

import cardlang.analysis.*;

@SuppressWarnings("nls")
public final class TKwnextid extends Token
{
    public TKwnextid()
    {
        super.setText("NextID");
    }

    public TKwnextid(int line, int pos)
    {
        super.setText("NextID");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TKwnextid(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTKwnextid(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TKwnextid text.");
    }
}