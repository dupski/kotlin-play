package org.revcrm.models

import org.revcrm.annotations.Field
import javax.persistence.Entity
import javax.validation.constraints.NotBlank

@Entity
class RevUser(

    @Field("First Name") @NotBlank
    var first_name: String,

    @Field("Last Name") @NotBlank
    var last_name: String,

    @Field("E-mail Address") @NotBlank
    var email: String

) : BaseModel()
