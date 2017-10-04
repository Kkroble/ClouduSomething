package groep3.cloudapi.model;

import java.util.Date;
import org.hibernate.validator.constraints.NotEmpty;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Reference;

@Entity (value = "tasks")
public class Task extends EntityModel 
{
    @Reference
    @NotEmpty
    User owner;
    
    @Reference
    @NotEmpty
    Goal goal;
    
    @Embedded
    @NotEmpty
    String name;
    
    @Embedded
    @NotEmpty
    String description;
    
    @Embedded
    @NotEmpty
    Integer points;
    
    @Embedded
    @NotEmpty
    Boolean isComplete;
    
    @Embedded
    @NotEmpty
    Date creationDate;

    public User getOwner()
    {
        return owner;
    }

    public void setOwner(User owner)
    {
        this.owner = owner;
    }

    public Goal getGoal()
    {
        return goal;
    }

    public void setGoal(Goal goal)
    {
        this.goal = goal;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public Integer getPoints()
    {
        return points;
    }

    public void setPoints(Integer points)
    {
        this.points = points;
    }

    public Boolean getIsComplete()
    {
        return isComplete;
    }

    public void setIsComplete(Boolean isComplete)
    {
        this.isComplete = isComplete;
    }

    public Date getCreationDate()
    {
        return creationDate;
    }

    public void setCreationDate(Date creationDate)
    {
        this.creationDate = creationDate;
    }

    
}
