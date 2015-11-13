/**
 * Archivists' Toolkit(TM) Copyright � 2005-2007 Regents of the University of California, New York University, & Five Colleges, Inc.
 * All rights reserved.
 *
 * This software is free. You can redistribute it and / or modify it under the terms of the Educational Community License (ECL)
 * version 1.0 (http://www.opensource.org/licenses/ecl1.php)
 *
 * This software is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the ECL license for more details about permissions and limitations.
 *
 *
 * Archivists' Toolkit(TM)
 * http://www.archiviststoolkit.org
 * info@archiviststoolkit.org
 *
 * @author Lee Mandell
 * Date: May 16, 2006
 * Time: 11:16:26 AM
 */

package org.archiviststoolkit.model.validators;

import org.archiviststoolkit.model.Accessions;
import org.archiviststoolkit.model.Locations;
import org.archiviststoolkit.util.ATPropertyValidationSupport;
import com.jgoodies.validation.ValidationResult;
import com.jgoodies.validation.util.ValidationUtils;

public class LocationsValidator extends ATAbstractValidator {


	// Instance Creation ******************************************************

	/**
	 * Constructs an validator
	 *
	 * @param accession the accession to be validated
	 */
	public LocationsValidator(Accessions accession) {
		this.objectToValidate = accession;
	}

	public LocationsValidator() {
	}


	// Validation *************************************************************

	/**
	 * Validates this Validator's Order and returns the result
	 * as an instance of {@link com.jgoodies.validation.ValidationResult}.
	 *
	 * @return the ValidationResult of the accession validation
	 */
	public ValidationResult validate() {

		Locations modelToValidate = (Locations)objectToValidate;

		ATPropertyValidationSupport support =
				new ATPropertyValidationSupport(modelToValidate, "Locations");

		//modelToValidate date or title are manditory
		if (!checkForMinimumRequirements(modelToValidate))
			support.addError("Barcode or Classification Number or (Building and Coordinate1)", "are mandatory");

        if (modelToValidate.getRepository() == null)
            support.addError("Repository", "is mandatory");

		checkForStringLengths(modelToValidate, support);

		return support.getResult();
	}

	private boolean checkForMinimumRequirements(Locations location) {
		if (ValidationUtils.isNotBlank(location.getBarcode())) {
			return true;
		} else if (ValidationUtils.isNotBlank(location.getClassificationNumber())) {
			return true;
		} else if (ValidationUtils.isNotBlank(location.getBuilding()) &&
				ValidationUtils.isNotBlank(location.getCoordinate1Label())) {
			return true;
		} else {
			return false;
		}
	}
}
