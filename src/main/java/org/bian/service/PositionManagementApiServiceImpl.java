/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class PositionManagementApiServiceImpl implements PositionManagementApiService {

	public SDPositionManagementActivateOutputModel activate(SDPositionManagementActivateInputModel request){
		return JsonReader.read("activate-SDPositionManagementActivateOutputModel.json",new TypeReference<SDPositionManagementActivateOutputModel>(){});
	}
	
	public SDPositionManagementConfigureOutputModel configure(String sdReferenceId, SDPositionManagementConfigureInputModel request){
		return JsonReader.read("configure-SDPositionManagementConfigureOutputModel.json",new TypeReference<SDPositionManagementConfigureOutputModel>(){});
	}
	
	public CRFinancialPositionStateControlOutputModel control(String sdReferenceId, String crReferenceId, CRFinancialPositionStateControlInputModel request){
		return JsonReader.read("control-CRFinancialPositionStateControlOutputModel.json",new TypeReference<CRFinancialPositionStateControlOutputModel>(){});
	}
	
	public SDPositionManagementFeedbackOutputModel feedback(String sdReferenceId, SDPositionManagementFeedbackInputModel request){
		return JsonReader.read("feedback-SDPositionManagementFeedbackOutputModel.json",new TypeReference<SDPositionManagementFeedbackOutputModel>(){});
	}
	
	public CRFinancialPositionStateInitiateOutputModel initiate(String sdReferenceId, CRFinancialPositionStateInitiateInputModel request){
		return JsonReader.read("initiate-CRFinancialPositionStateInitiateOutputModel.json",new TypeReference<CRFinancialPositionStateInitiateOutputModel>(){});
	}
	
	public BQTransactionApplicationInitiateOutputModel initiateTransactionapplication(String sdReferenceId, String crReferenceId, BQTransactionApplicationInitiateInputModel request){
		return JsonReader.read("initiate-BQTransactionApplicationInitiateOutputModel.json",new TypeReference<BQTransactionApplicationInitiateOutputModel>(){});
	}
	
	public BQTrialTransactionInitiateOutputModel initiateTrialtransaction(String sdReferenceId, String crReferenceId, BQTrialTransactionInitiateInputModel request){
		return JsonReader.read("initiate-BQTrialTransactionInitiateOutputModel.json",new TypeReference<BQTrialTransactionInitiateOutputModel>(){});
	}
	
	public BQTransactionApplicationRetrieveOutputModel retrieveTransactionapplication(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQTransactionApplicationRetrieveOutputModel.json",new TypeReference<BQTransactionApplicationRetrieveOutputModel>(){});
	}
	
	public BQTrialTransactionRetrieveOutputModel retrieveTrialtransaction(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQTrialTransactionRetrieveOutputModel.json",new TypeReference<BQTrialTransactionRetrieveOutputModel>(){});
	}
	
	public CRFinancialPositionStateRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRFinancialPositionStateRetrieveOutputModel.json",new TypeReference<CRFinancialPositionStateRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDPositionManagementRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDPositionManagementRetrieveOutputModel.json",new TypeReference<SDPositionManagementRetrieveOutputModel>(){});
	}
	
	public CRFinancialPositionStateUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRFinancialPositionStateUpdateInputModel request){
		return JsonReader.read("update-CRFinancialPositionStateUpdateOutputModel.json",new TypeReference<CRFinancialPositionStateUpdateOutputModel>(){});
	}
	
	public BQTransactionApplicationUpdateOutputModel updateTransactionapplication(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTransactionApplicationUpdateInputModel request){
		return JsonReader.read("update-BQTransactionApplicationUpdateOutputModel.json",new TypeReference<BQTransactionApplicationUpdateOutputModel>(){});
	}
	
	public BQTrialTransactionUpdateOutputModel updateTrialtransaction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTrialTransactionUpdateInputModel request){
		return JsonReader.read("update-BQTrialTransactionUpdateOutputModel.json",new TypeReference<BQTrialTransactionUpdateOutputModel>(){});
	}
	
}
