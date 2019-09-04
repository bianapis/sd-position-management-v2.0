/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface PositionManagementApiService {

	SDPositionManagementActivateOutputModel activate(SDPositionManagementActivateInputModel request);
	
	SDPositionManagementConfigureOutputModel configure(String sdReferenceId, SDPositionManagementConfigureInputModel request);
	
	CRFinancialPositionStateControlOutputModel control(String sdReferenceId, String crReferenceId, CRFinancialPositionStateControlInputModel request);
	
	SDPositionManagementFeedbackOutputModel feedback(String sdReferenceId, SDPositionManagementFeedbackInputModel request);
	
	CRFinancialPositionStateInitiateOutputModel initiate(String sdReferenceId, CRFinancialPositionStateInitiateInputModel request);
	
	BQTransactionApplicationInitiateOutputModel initiateTransactionapplication(String sdReferenceId, String crReferenceId, BQTransactionApplicationInitiateInputModel request);
	
	BQTrialTransactionInitiateOutputModel initiateTrialtransaction(String sdReferenceId, String crReferenceId, BQTrialTransactionInitiateInputModel request);
	
	BQTransactionApplicationRetrieveOutputModel retrieveTransactionapplication(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQTrialTransactionRetrieveOutputModel retrieveTrialtransaction(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	CRFinancialPositionStateRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDPositionManagementRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRFinancialPositionStateUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRFinancialPositionStateUpdateInputModel request);
	
	BQTransactionApplicationUpdateOutputModel updateTransactionapplication(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTransactionApplicationUpdateInputModel request);
	
	BQTrialTransactionUpdateOutputModel updateTrialtransaction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTrialTransactionUpdateInputModel request);
	
}
