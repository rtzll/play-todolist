package models

import org.h2.engine.User
import org.joda.time.DateTime

case class Todo(description: String, createdAt: DateTime, finishedAt: DateTime,
                finished: Boolean, creator: User, todoListId: Integer)
