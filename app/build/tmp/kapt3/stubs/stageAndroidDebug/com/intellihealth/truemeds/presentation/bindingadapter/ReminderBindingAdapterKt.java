package com.intellihealth.truemeds.presentation.bindingadapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007\u001a\u0018\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007\u001a*\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007\u001a\u001a\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007\u001a&\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00140\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\u0015"}, d2 = {"setChipData", "", "view", "Landroidx/recyclerview/widget/RecyclerView;", "list", "", "Lcom/intellihealth/truemeds/data/model/ChipSelectionModel;", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/ReminderViewModel;", "setRadioCheck", "Lcom/intellihealth/salt/views/radiofield/Radio;", "selection", "", "setReminderFrequency", "Lcom/intellihealth/truemeds/data/model/reminder/FrequencyListModel$FrequencyList;", "setUpDataPatient", "Lcom/intellihealth/salt/views/cards/AddressPatientDetailsCard;", "data", "Lcom/intellihealth/salt/models/AddressPatientDetailsCardModel;", "setUserNavList", "Lcom/intellihealth/truemeds/data/model/reminder/ReminderListModel$ReminderList;", "app_stageAndroidDebug"})
public final class ReminderBindingAdapterKt {
    
    @androidx.databinding.BindingAdapter(value = {"setReminderList", "reminderViewModel"})
    public static final void setUserNavList(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.reminder.ReminderListModel.ReminderList> list, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.ReminderViewModel viewModel) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"reminderFrequency", "viewModel"})
    public static final void setReminderFrequency(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.data.model.reminder.FrequencyListModel.FrequencyList> list, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.viewmodel.ReminderViewModel viewModel) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setRadioCheck"})
    public static final void setRadioCheck(@org.jetbrains.annotations.NotNull()
    com.intellihealth.salt.views.radiofield.Radio view, boolean selection) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setChipData", "reminderViewModell"})
    public static final void setChipData(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.ChipSelectionModel> list, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.ReminderViewModel viewModel) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setUpDataPatient"})
    public static final void setUpDataPatient(@org.jetbrains.annotations.NotNull()
    com.intellihealth.salt.views.cards.AddressPatientDetailsCard view, @org.jetbrains.annotations.Nullable()
    com.intellihealth.salt.models.AddressPatientDetailsCardModel data) {
    }
}