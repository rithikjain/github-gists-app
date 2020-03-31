package com.rithikjain.projectgists.di.modules

import com.rithikjain.projectgists.ui.auth.AuthViewModel
import com.rithikjain.projectgists.ui.gists.GistsViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { GistsViewModel(get()) }
    viewModel { AuthViewModel(get()) }
}