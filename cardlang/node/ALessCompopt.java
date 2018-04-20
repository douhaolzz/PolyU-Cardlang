/* This file was generated by SableCC (http://www.sablecc.org/). */

package cardlang.node;

import cardlang.analysis.*;

@SuppressWarnings("nls")
public final class ALessCompopt extends PCompopt
{
    private TOptless _optless_;

    public ALessCompopt()
    {
        // Constructor
    }

    public ALessCompopt(
        @SuppressWarnings("hiding") TOptless _optless_)
    {
        // Constructor
        setOptless(_optless_);

    }

    @Override
    public Object clone()
    {
        return new ALessCompopt(
            cloneNode(this._optless_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALessCompopt(this);
    }

    public TOptless getOptless()
    {
        return this._optless_;
    }

    public void setOptless(TOptless node)
    {
        if(this._optless_ != null)
        {
            this._optless_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._optless_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._optless_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._optless_ == child)
        {
            this._optless_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._optless_ == oldChild)
        {
            setOptless((TOptless) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}