plugins {
  `kotlin-dsl`
}

apply {
  plugin("kotlin")
}

repositories {
  jcenter()
  google()
}

dependencies {
  api("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.72")
  api(gradleApi())
}

apply {
  plugin("java-gradle-plugin")
}
