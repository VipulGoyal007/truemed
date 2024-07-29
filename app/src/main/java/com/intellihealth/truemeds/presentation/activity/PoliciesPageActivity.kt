package com.intellihealth.truemeds.presentation.activity

import android.os.Bundle
import androidx.core.os.bundleOf
import com.intellihealth.salt.callbacks.BackArrowClickCallback
import com.intellihealth.salt.models.MobileSectionHeadersModel
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.ActivityPoliciesPageBinding
import com.intellihealth.truemeds.domain.navigation.navigateToPolicyDetailActivity
import com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase
import com.intellihealth.truemeds.presentation.analytics.FirebaseEvent
import com.intellihealth.truemeds.presentation.utils.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class PoliciesPageActivity : BaseActivity() {

    private val binding by viewBinding(ActivityPoliciesPageBinding::inflate)

    @Inject
    lateinit var firebaseEventUseCase: FirebaseEventUseCase
    override fun extractIntentData(){

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.txtHeader.setUpMobileSectionHeadersData(
            MobileSectionHeadersModel(
                getString(R.string.policies), "", "",
                "", 0
            )
        )
        binding.txtHeader.setBackArrowClickCallback(object :
            BackArrowClickCallback {
            override fun onBackArrowClick() {
                overridePendingTransition(0, R.anim.slide_out)
                finish()
            }
        })
        binding.clPrivacyPolicy.setOnClickListener {
            firebaseEventUseCase.logFirebaseEvent(FirebaseEvent.FIREBASE_PRIVACY_POLICY_VIEWED,"PrivacyPolicyUpdate")

          /*  val intent = Intent(this, PolicyDetailActivity::class.java)
            intent.putExtra("key", "Privacy Policy")
            startActivity(intent)
            overridePendingTransition( R.anim.slide_in,0)
*/
            navigateToPolicyDetailActivity(
                params = bundleOf(
                    "key" to "Privacy Policy"
                ),
            )
        }

        binding.clTnc.setOnClickListener {
            firebaseEventUseCase.logFirebaseEvent(FirebaseEvent.FIREBASE_TNC_VIEWED,"PrivacyPolicyUpdate")

            /*val intent = Intent(this, PolicyDetailActivity::class.java)
            intent.putExtra("key", "Terms & Condition")
            startActivity(intent)
            overridePendingTransition( R.anim.slide_in,0)*/

            navigateToPolicyDetailActivity(
                params = bundleOf(
                    "key" to "Terms & Condition"
                ),
            )
        }

        updateStatusBarColor()

    }

//    override fun onBackPressed() {
//        finish()
//        overridePendingTransition(0, R.anim.slide_out)
//        super.onBackPressed()
//
//    }
}