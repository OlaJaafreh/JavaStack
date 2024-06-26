package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
	private Integer id;
    private String role;
    private ArrayList<String> securityIncidents;
//    private Integer id;
    private int pin;
    
    // TO DO: Implement a constructor that takes an ID and a role
    public AdminUser(Integer employeeID,String role) {
        this.id = employeeID;
        this.role = role;
        this.securityIncidents = new ArrayList<>();
    }
    // TO DO: Implement HIPAACompliantUser!
    // TO DO: Implement HIPAACompliantAdmin!
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
	@Override
	public ArrayList<String> reportSecurityIncidents() {
		// TODO Auto-generated method stub
		return this.securityIncidents;
	}
	@Override
	public boolean assignPin(int pin) {
		if (String.valueOf(pin).length() < 6) {
            return false;
        }
        this.pin = pin;
        return true;
	}
	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if(!this.id.equals(confirmedAuthID)) {
			this.authIncident();
			return false;
			}
		
			return true;
	}

	public Integer getEmployeeID() {
		return id;
	}

	public void setEmployeeID(Integer employeeID) {
		this.id = employeeID;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}

	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
		this.securityIncidents = securityIncidents;
	}


	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
    
   
	
}
