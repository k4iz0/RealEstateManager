package ltd.kaizo.realestatemanager.controller.ui.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u0013H\u0002J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\b\u0010\u0017\u001a\u00020\u0013H\u0002J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J\b\u0010\u001a\u001a\u00020\u0013H\u0014J\u0016\u0010\u001b\u001a\u00020\u00132\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u001dH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lltd/kaizo/realestatemanager/controller/ui/list/ListFragment;", "Lltd/kaizo/realestatemanager/controller/ui/base/BaseFragment;", "()V", "adapter", "Lltd/kaizo/realestatemanager/adapter/ListAdapter;", "estateList", "", "Lltd/kaizo/realestatemanager/model/Estate;", "fragmentLayout", "", "getFragmentLayout", "()I", "listViewModel", "Lltd/kaizo/realestatemanager/controller/ui/list/ListViewModel;", "parentActivity", "Lltd/kaizo/realestatemanager/controller/ui/list/ListActivity;", "search", "", "configureDesign", "", "configureObserver", "configureRecycleView", "configureSwipeRefreshLayout", "configureViewModel", "onEstateItemClicked", "estate", "updateDesign", "updateList", "list", "", "app_debug"})
public final class ListFragment extends ltd.kaizo.realestatemanager.controller.ui.base.BaseFragment {
    private ltd.kaizo.realestatemanager.controller.ui.list.ListViewModel listViewModel;
    private ltd.kaizo.realestatemanager.adapter.ListAdapter adapter;
    private java.util.List<ltd.kaizo.realestatemanager.model.Estate> estateList;
    private ltd.kaizo.realestatemanager.controller.ui.list.ListActivity parentActivity;
    private boolean search;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getFragmentLayout() {
        return 0;
    }
    
    @java.lang.Override()
    protected void configureDesign() {
    }
    
    @java.lang.Override()
    protected void updateDesign() {
    }
    
    private final void configureObserver() {
    }
    
    private final void configureViewModel() {
    }
    
    private final void configureRecycleView() {
    }
    
    private final void onEstateItemClicked(ltd.kaizo.realestatemanager.model.Estate estate) {
    }
    
    private final void configureSwipeRefreshLayout() {
    }
    
    private final void updateList(java.util.List<ltd.kaizo.realestatemanager.model.Estate> list) {
    }
    
    public ListFragment() {
        super();
    }
}