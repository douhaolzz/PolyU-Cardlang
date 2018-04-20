/* This file was generated by SableCC (http://www.sablecc.org/). */

package cardlang.node;

import cardlang.analysis.*;

@SuppressWarnings("nls")
public final class AShuffleStmt extends PStmt
{
    private TKwshuffle _kwshuffle_;

    public AShuffleStmt()
    {
        // Constructor
    }

    public AShuffleStmt(
        @SuppressWarnings("hiding") TKwshuffle _kwshuffle_)
    {
        // Constructor
        setKwshuffle(_kwshuffle_);

    }

    @Override
    public Object clone()
    {
        return new AShuffleStmt(
            cloneNode(this._kwshuffle_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAShuffleStmt(this);
    }

    public TKwshuffle getKwshuffle()
    {
        return this._kwshuffle_;
    }

    public void setKwshuffle(TKwshuffle node)
    {
        if(this._kwshuffle_ != null)
        {
            this._kwshuffle_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kwshuffle_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._kwshuffle_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._kwshuffle_ == child)
        {
            this._kwshuffle_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._kwshuffle_ == oldChild)
        {
            setKwshuffle((TKwshuffle) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}