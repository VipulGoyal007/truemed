package com.intellihealth.truemeds.presentation.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001$B\u001d\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0010J\u0016\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0010J\u0006\u0010\u001a\u001a\u00020\u0016J\b\u0010\u001b\u001a\u00020\u0010H\u0016J\u001c\u0010\u001c\u001a\u00020\u001d2\n\u0010\u001e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0010H\u0016J\u001c\u0010 \u001a\u00060\u0002R\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0010H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006%"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/ReminderFrequencyAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/intellihealth/truemeds/presentation/adapter/ReminderFrequencyAdapter$ItemRadioViewHolder;", "list", "", "Lcom/intellihealth/truemeds/data/model/reminder/FrequencyListModel$FrequencyList;", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/ReminderViewModel;", "(Ljava/util/List;Lcom/intellihealth/truemeds/presentation/viewmodel/ReminderViewModel;)V", "binding", "Lcom/intellihealth/truemeds/databinding/AdapterReminderTimeItemBinding;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "selectedItemPosition", "", "getViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/ReminderViewModel;", "setViewModel", "(Lcom/intellihealth/truemeds/presentation/viewmodel/ReminderViewModel;)V", "calculateNextNDays", "", "currentDate", "numberOfDays", "calculateNextNShowDays", "getCurrentDate", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ItemRadioViewHolder", "app_prodDebug"})
public final class ReminderFrequencyAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.intellihealth.truemeds.presentation.adapter.ReminderFrequencyAdapter.ItemRadioViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.intellihealth.truemeds.data.model.reminder.FrequencyListModel.FrequencyList> list;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.presentation.viewmodel.ReminderViewModel viewModel;
    private int selectedItemPosition = 0;
    private com.intellihealth.truemeds.databinding.AdapterReminderTimeItemBinding binding;
    
    public ReminderFrequencyAdapter(@org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.data.model.reminder.FrequencyListModel.FrequencyList> list, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.ReminderViewModel viewModel) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.intellihealth.truemeds.data.model.reminder.FrequencyListModel.FrequencyList> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.data.model.reminder.FrequencyListModel.FrequencyList> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.viewmodel.ReminderViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.ReminderViewModel p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.intellihealth.truemeds.presentation.adapter.ReminderFrequencyAdapter.ItemRadioViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.adapter.ReminderFrequencyAdapter.ItemRadioViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String calculateNextNDays(@org.jetbrains.annotations.NotNull()
    java.lang.String currentDate, int numberOfDays) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String calculateNextNShowDays(@org.jetbrains.annotations.NotNull()
    java.lang.String currentDate, int numberOfDays) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentDate() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/ReminderFrequencyAdapter$ItemRadioViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/intellihealth/truemeds/databinding/AdapterReminderTimeItemBinding;", "(Lcom/intellihealth/truemeds/presentation/adapter/ReminderFrequencyAdapter;Lcom/intellihealth/truemeds/databinding/AdapterReminderTimeItemBinding;)V", "bind", "", "model", "Lcom/intellihealth/truemeds/data/model/reminder/FrequencyListModel$FrequencyList;", "position", "", "app_prodDebug"})
    public final class ItemRadioViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.intellihealth.truemeds.databinding.AdapterReminderTimeItemBinding binding = null;
        
        public ItemRadioViewHolder(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.databinding.AdapterReminderTimeItemBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.data.model.reminder.FrequencyListModel.FrequencyList model, int position) {
        }
    }
}