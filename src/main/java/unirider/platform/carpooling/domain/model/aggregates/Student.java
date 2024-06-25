package unirider.platform.carpooling.domain.model.aggregates;

import unirider.platform.carpooling.domain.model.valueobjects.UniRiderStudentRecordId;
import unirider.platform.carpooling.domain.model.valueobjects.ProfileId;
import unirider.platform.carpooling.domain.model.valueobjects.StudentPerformanceMetricSet;
import unirider.platform.shared.domain.model.aggregates.AuditableAbstractAggregateRoot;
import unirider.platform.shared.domain.model.entities.AuditableModel;
import jakarta.persistence.*;
import lombok.Getter;


/**
 * Represents a student.
 * The student is an aggregate root.
 */
@Entity
public class Student extends AuditableAbstractAggregateRoot<Student> {

    @Getter
    @Embedded
    @Column(name = "unirider_student_id")
    private final UniRiderStudentRecordId uniRiderStudentRecordId;

    @Embedded
    private ProfileId profileId;

    @Embedded
    private StudentPerformanceMetricSet performanceMetricSet;

    public Student() {
        this.uniRiderStudentRecordId = new UniRiderStudentRecordId();
        this.performanceMetricSet = new StudentPerformanceMetricSet();
    }

    public Student(Long profileId) {
        this();
        this.profileId = new ProfileId(profileId);
    }

    public Student(ProfileId profileId) {
        this();
        this.profileId = profileId;
    }

    public void updateMetricsOnRideOffered() {
        this.performanceMetricSet = this.performanceMetricSet.incrementTotalRidesOffered();
    }

    public void updateStudentMetricsOnRideOffered() {
        this.performanceMetricSet = this.performanceMetricSet.incrementTotalRidesTaken();
    }

    public String getStudentRecordId() {
        return this.uniRiderStudentRecordId.studentRecordId();
    }

    public Long getProfileId() {
        return this.profileId.profileId();
    }

}