package models

import org.h2.engine.User
import org.joda.time.DateTime

case class TodoList(title: String, createdAt: DateTime, creator: User, todos: Array[Todo])
