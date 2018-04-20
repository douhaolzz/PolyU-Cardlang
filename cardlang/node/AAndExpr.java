/* This file was generated by SableCC (http://www.sablecc.org/). */

package cardlang.node;

import cardlang.analysis.*;

@SuppressWarnings("nls")
public final class AAndExpr extends PExpr
{
    private PExpr _expr_;
    private TKwand _kwand_;
    private PFactor _factor_;

    public AAndExpr()
    {
        // Constructor
    }

    public AAndExpr(
        @SuppressWarnings("hiding") PExpr _expr_,
        @SuppressWarnings("hiding") TKwand _kwand_,
        @SuppressWarnings("hiding") PFactor _factor_)
    {
        // Constructor
        setExpr(_expr_);

        setKwand(_kwand_);

        setFactor(_factor_);

    }

    @Override
    public Object clone()
    {
        return new AAndExpr(
            cloneNode(this._expr_),
            cloneNode(this._kwand_),
            cloneNode(this._factor_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAndExpr(this);
    }

    public PExpr getExpr()
    {
        return this._expr_;
    }

    public void setExpr(PExpr node)
    {
        if(this._expr_ != null)
        {
            this._expr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expr_ = node;
    }

    public TKwand getKwand()
    {
        return this._kwand_;
    }

    public void setKwand(TKwand node)
    {
        if(this._kwand_ != null)
        {
            this._kwand_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kwand_ = node;
    }

    public PFactor getFactor()
    {
        return this._factor_;
    }

    public void setFactor(PFactor node)
    {
        if(this._factor_ != null)
        {
            this._factor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._factor_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expr_)
            + toString(this._kwand_)
            + toString(this._factor_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expr_ == child)
        {
            this._expr_ = null;
            return;
        }

        if(this._kwand_ == child)
        {
            this._kwand_ = null;
            return;
        }

        if(this._factor_ == child)
        {
            this._factor_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expr_ == oldChild)
        {
            setExpr((PExpr) newChild);
            return;
        }

        if(this._kwand_ == oldChild)
        {
            setKwand((TKwand) newChild);
            return;
        }

        if(this._factor_ == oldChild)
        {
            setFactor((PFactor) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}