package ltd.kaizo.realestatemanager.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rH\u0016R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lltd/kaizo/realestatemanager/adapter/ListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lltd/kaizo/realestatemanager/adapter/ListAdapter$ListViewHolder;", "estateList", "", "Lltd/kaizo/realestatemanager/model/Estate;", "clickListener", "Lkotlin/Function1;", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "lastView", "Landroid/view/View;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ListViewHolder", "app_debug"})
public final class ListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<ltd.kaizo.realestatemanager.adapter.ListAdapter.ListViewHolder> {
    private android.view.View lastView;
    private final java.util.List<ltd.kaizo.realestatemanager.model.Estate> estateList = null;
    private final kotlin.jvm.functions.Function1<ltd.kaizo.realestatemanager.model.Estate, kotlin.Unit> clickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ltd.kaizo.realestatemanager.adapter.ListAdapter.ListViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    ltd.kaizo.realestatemanager.adapter.ListAdapter.ListViewHolder holder, int position) {
    }
    
    public ListAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<ltd.kaizo.realestatemanager.model.Estate> estateList, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ltd.kaizo.realestatemanager.model.Estate, kotlin.Unit> clickListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\u0013\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\f\u00a8\u0006\u0017"}, d2 = {"Lltd/kaizo/realestatemanager/adapter/ListAdapter$ListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "cardView", "Landroidx/cardview/widget/CardView;", "getCardView", "()Landroidx/cardview/widget/CardView;", "location", "Landroid/widget/TextView;", "getLocation", "()Landroid/widget/TextView;", "picture", "Landroid/widget/ImageView;", "getPicture", "()Landroid/widget/ImageView;", "price", "getPrice", "soldState", "getSoldState", "type", "getType", "app_debug"})
    public static final class ListViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final androidx.cardview.widget.CardView cardView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView picture = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView type = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView location = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView price = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView soldState = null;
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.cardview.widget.CardView getCardView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getPicture() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getLocation() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getPrice() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getSoldState() {
            return null;
        }
        
        public ListViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}