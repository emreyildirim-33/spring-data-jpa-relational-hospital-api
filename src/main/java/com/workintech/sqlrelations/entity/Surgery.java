package com.workintech.sqlrelations.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import org.springframework.data.repository.query.Param;

import javax.print.Doc;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "surgery")
public class Surgery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "nurse_id")
    private Nurse nurse;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    public void setPatientId(long patientId) {
        Patient p = new Patient();
        p.setId(patientId);
        this.patient = p;
    }

    public void setNurseId(long nurseId) {
        Nurse n = new Nurse();
        n.setId(nurseId);
        this.nurse = n ;
    }

    public void setDoctorId(long doctorId) {
        Doctor d = new Doctor();
        d.setId(doctorId);
        this.doctor = d;
    }

    public long getDoctorId() {
        return this.doctor.getId();
    }
}
