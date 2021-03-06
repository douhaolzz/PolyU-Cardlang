/* This file was generated by SableCC (http://www.sablecc.org/). */

package cardlang.node;

import cardlang.analysis.*;

@SuppressWarnings("nls")
public final class ASingleIf extends PIf
{
    private TKwif _kwif_;
    private PExpr _expr_;
    private TKwthen _kwthen_;
    private PStmtblock _stmtblock_;

    public ASingleIf()
    {
        // Constructor
    }

    public ASingleIf(
        @SuppressWarnings("hiding") TKwif _kwif_,
        @SuppressWarnings("hiding") PExpr _expr_,
        @SuppressWarnings("hiding") TKwthen _kwthen_,
        @SuppressWarnings("hiding") PStmtblock _stmtblock_)
    {
        // Constructor
        setKwif(_kwif_);

        setExpr(_expr_);

        setKwthen(_kwthen_);

        setStmtblock(_stmtblock_);

    }

    @Override
    public Object clone()
    {
        return new ASingleIf(
            cloneNode(this._kwif_),
            cloneNode(this._expr_),
            cloneNode(this._kwthen_),
            cloneNode(this._stmtblock_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASingleIf(this);
    }

    public TKwif getKwif()
    {
        return this._kwif_;
    }

    public void setKwif(TKwif node)
    {
        if(this._kwif_ != null)
        {
            this._kwif_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kwif_ = node;
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

    public TKwthen getKwthen()
    {
        return this._kwthen_;
    }

    public void setKwthen(TKwthen node)
    {
        if(this._kwthen_ != null)
        {
            this._kwthen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kwthen_ = node;
    }

    public PStmtblock getStmtblock()
    {
        return this._stmtblock_;
    }

    public void setStmtblock(PStmtblock node)
    {
        if(this._stmtblock_ != null)
        {
            this._stmtblock_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._stmtblock_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._kwif_)
            + toString(this._expr_)
            + toString(this._kwthen_)
            + toString(this._stmtblock_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._kwif_ == child)
        {
            this._kwif_ = null;
            return;
        }

        if(this._expr_ == child)
        {
            this._expr_ = null;
            return;
        }

        if(this._kwthen_ == child)
        {
            this._kwthen_ = null;
            return;
        }

        if(this._stmtblock_ == child)
        {
            this._stmtblock_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._kwif_ == oldChild)
        {
            setKwif((TKwif) newChild);
            return;
        }

        if(this._expr_ == oldChild)
        {
            setExpr((PExpr) newChild);
            return;
        }

        if(this._kwthen_ == oldChild)
        {
            setKwthen((TKwthen) newChild);
            return;
        }

        if(this._stmtblock_ == oldChild)
        {
            setStmtblock((PStmtblock) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
