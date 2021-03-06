package org.revcrm.models

import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.Index
import javax.persistence.ManyToOne
import javax.persistence.Table
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotEmpty

enum class AuthType {
    GOOGLE
}

@Entity
@Table(
    indexes = [
        Index(
            columnList = "auth_type, auth_id"
        )
    ]
)
class RevUserAuth(

    @ManyToOne
    var user: RevUser,

    @Enumerated(EnumType.STRING)
    var auth_type: AuthType,

    @field:NotEmpty
    @field:Min(10)
    @field:Max(100)
    var auth_id: String

) : BaseModel()
