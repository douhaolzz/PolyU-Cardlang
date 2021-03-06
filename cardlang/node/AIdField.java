/* This file was generated by SableCC (http://www.sablecc.org/). */

package cardlang.node;

import cardlang.analysis.*;

@SuppressWarnings("nls")
public final class AIdField extends PField
{
    private PObj _obj_;
    private TPoint _point_;
    private PId _id_;

    public AIdField()
    {
        // Constructor
    }

    public AIdField(
        @SuppressWarnings("hiding") PObj _obj_,
        @SuppressWarnings("hiding") TPoint _point_,
        @SuppressWarnings("hiding") PId _id_)
    {
        // Constructor
        setObj(_obj_);

        setPoint(_point_);

        setId(_id_);

    }

    @Override
    public Object clone()
    {
        return new AIdField(
            cloneNode(this._obj_),
            cloneNode(this._point_),
            cloneNode(this._id_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIdField(this);
    }

    public PObj getObj()
    {
        return this._obj_;
    }

    public void setObj(PObj node)
    {
        if(this._obj_ != null)
        {
            this._obj_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._obj_ = node;
    }

    public TPoint getPoint()
    {
        return this._point_;
    }

    public void setPoint(TPoint node)
    {
        if(this._point_ != null)
        {
            this._point_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._point_ = node;
    }

    public PId getId()
    {
        return this._id_;
    }

    public void setId(PId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._obj_)
            + toString(this._point_)
            + toString(this._id_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._obj_ == child)
        {
            this._obj_ = null;
            return;
        }

        if(this._point_ == child)
        {
            this._point_ = null;
            return;
        }

        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._obj_ == oldChild)
        {
            setObj((PObj) newChild);
            return;
        }

        if(this._point_ == oldChild)
        {
            setPoint((TPoint) newChild);
            return;
        }

        if(this._id_ == oldChild)
        {
            setId((PId) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
