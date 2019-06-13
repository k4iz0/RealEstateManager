package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new ltd.kaizo.realestatemanager.DataBinderMapperImpl());
  }
}
