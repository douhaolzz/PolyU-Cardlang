/* This file was generated by SableCC (http://www.sablecc.org/). */

package cardlang.node;

import cardlang.analysis.*;

@SuppressWarnings("nls")
public final class ADivNumexpr extends PNumexpr
{
    private PNumexpr _numexpr_;
    private TOptdiv _optdiv_;
    private PVal _val_;

    public ADivNumexpr()
    {
        // Constructor
    }

    public ADivNumexpr(
        @SuppressWarnings("hiding") PNumexpr _numexpr_,
        @SuppressWarnings("hiding") TOptdiv _optdiv_,
        @SuppressWarnings("hiding") PVal _val_)
    {
        // Constructor
        setNumexpr(_numexpr_);

        setOptdiv(_optdiv_);

        setVal(_val_);

    }

    @Override
    public Object clone()
    {
        return new ADivNumexpr(
            cloneNode(this._numexpr_),
            cloneNode(this._optdiv_),
            cloneNode(this._val_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADivNumexpr(this);
    }

    public PNumexpr getNumexpr()
    {
        return this._numexpr_;
    }

    public void setNumexpr(PNumexpr node)
    {
        if(this._numexpr_ != null)
        {
            this._numexpr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._numexpr_ = node;
    }

    public TOptdiv getOptdiv()
    {
        return this._optdiv_;
    }

    public void setOptdiv(TOptdiv node)
    {
        if(this._optdiv_ != null)
        {
            this._optdiv_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._optdiv_ = node;
    }

    public PVal getVal()
    {
        return this._val_;
    }

    public void setVal(PVal node)
    {
        if(this._val_ != null)
        {
            this._val_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._val_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._numexpr_)
            + toString(this._optdiv_)
            + toString(this._val_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._numexpr_ == child)
        {
            this._numexpr_ = null;
            return;
        }

        if(this._optdiv_ == child)
        {
            this._optdiv_ = null;
            return;
        }

        if(this._val_ == child)
        {
            this._val_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._numexpr_ == oldChild)
        {
            setNumexpr((PNumexpr) newChild);
            return;
        }

        if(this._optdiv_ == oldChild)
        {
            setOptdiv((TOptdiv) newChild);
            return;
        }

        if(this._val_ == oldChild)
        {
            setVal((PVal) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
