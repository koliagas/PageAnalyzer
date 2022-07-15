install: # Вычищение и создание новой сборки
	./gradlew clean install
run-dist: # Запуск исполняемого файла
	./build/install/app/bin/app
check-updates: # Проверка обновления зависимостей и плагинов
	./gradlew dependencyUpdates
lint: #Проверка кода на сооответствие стандартам
	./gradlew checkstyleMain
build: #сборка проекта
	./gradlew clean build
clean: #удаление билда
	./gradlew clean