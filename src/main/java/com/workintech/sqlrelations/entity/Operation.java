package com.workintech.sqlrelations.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.print.Doc;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "operation")
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private  Patient patient;

    public void setPatientId(long patientId) {
        Patient p = new Patient();
        p.setId(patientId);
        this.patient = p;
    }

    public void setDoctorId(long doctorId) {
        Doctor d = new Doctor();
        d.setId(doctorId);
        this.doctor = d;
    }

    public long getDoctorId() {
        return (this.doctor != null) ? this.doctor.getId(): 0;
    }
}
