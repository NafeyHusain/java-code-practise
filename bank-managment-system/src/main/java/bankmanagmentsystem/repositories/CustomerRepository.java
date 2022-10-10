package bankmanagmentsystem.repositories;

import bankmanagmentsystem.models.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
    REPOSITORY IS FOR 2 THINGS:
    1.WRITING NATIVE SQL QUERIES
    2.
    AND
    REPOSITORY IS AUTOWIRED  TO DAOIMPL JAVA CLASS
 */
//@Repository
public interface CustomerRepository extends CrudRepository<Customer,Integer> {
    //@Query(value = "select * from customer where cusId=:id",nativeQuery = true)
    //public Customer findByCusId(int cusId);
    public List<Customer> findAll();
    public Customer findById(Long cusId);
    public Customer findByName(String cusName);
    public Customer save(Customer customer);
    public void deleteById(Long cusId);

}


//    Appointment appointment=new Appointment();
////        appointment.setDoctor(doctor_id);
////                appointment.setPatient(patient_id);
////                appointmentRepository.save(appointment);
////                Patient patient=patientDao.read(patient_id);
////                if (patient==null){
////                patientDao.create(patient.setId(patient_id));
////                }
////                patient.setAppointments(new ArrayList<Appointment>());
////
////        return appointmentRepository.save(appointment);
