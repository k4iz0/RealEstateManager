package ltd.kaizo.realestatemanager.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014BA\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012$\u0010\b\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0007H\u0016R,\u0010\b\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lltd/kaizo/realestatemanager/adapter/PictureListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lltd/kaizo/realestatemanager/adapter/PictureListAdapter$PictureListViewHolder;", "pictureList", "", "Lltd/kaizo/realestatemanager/model/EstatePhoto;", "sourceId", "", "clickListener", "Lkotlin/Function3;", "", "(Ljava/util/List;ILkotlin/jvm/functions/Function3;)V", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "PictureListViewHolder", "app_debug"})
public final class PictureListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<ltd.kaizo.realestatemanager.adapter.PictureListAdapter.PictureListViewHolder> {
    private final java.util.List<ltd.kaizo.realestatemanager.model.EstatePhoto> pictureList = null;
    private final int sourceId = 0;
    private final kotlin.jvm.functions.Function3<java.util.List<ltd.kaizo.realestatemanager.model.EstatePhoto>, java.lang.Integer, java.lang.Integer, kotlin.Unit> clickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ltd.kaizo.realestatemanager.adapter.PictureListAdapter.PictureListViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    ltd.kaizo.realestatemanager.adapter.PictureListAdapter.PictureListViewHolder holder, int position) {
    }
    
    public PictureListAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<ltd.kaizo.realestatemanager.model.EstatePhoto> pictureList, int sourceId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super java.util.List<ltd.kaizo.realestatemanager.model.EstatePhoto>, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> clickListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\f\u00a8\u0006\u0017"}, d2 = {"Lltd/kaizo/realestatemanager/adapter/PictureListAdapter$PictureListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "cardView", "Landroidx/cardview/widget/CardView;", "getCardView", "()Landroidx/cardview/widget/CardView;", "heartBtn", "Landroid/widget/ImageButton;", "getHeartBtn", "()Landroid/widget/ImageButton;", "nameItem", "Landroid/widget/TextView;", "getNameItem", "()Landroid/widget/TextView;", "pictureItem", "Landroid/widget/ImageView;", "getPictureItem", "()Landroid/widget/ImageView;", "removeBtn", "getRemoveBtn", "app_debug"})
    public static final class PictureListViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final androidx.cardview.widget.CardView cardView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView pictureItem = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView nameItem = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageButton heartBtn = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageButton removeBtn = null;
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.cardview.widget.CardView getCardView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getPictureItem() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getNameItem() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageButton getHeartBtn() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageButton getRemoveBtn() {
            return null;
        }
        
        public PictureListViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}