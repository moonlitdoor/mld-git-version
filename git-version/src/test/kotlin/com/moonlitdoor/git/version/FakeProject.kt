package com.moonlitdoor.git.version

import groovy.lang.Closure
import org.gradle.api.*
import org.gradle.api.artifacts.ConfigurationContainer
import org.gradle.api.artifacts.dsl.ArtifactHandler
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.api.artifacts.dsl.DependencyLockingHandler
import org.gradle.api.artifacts.dsl.RepositoryHandler
import org.gradle.api.component.SoftwareComponentContainer
import org.gradle.api.file.*
import org.gradle.api.initialization.dsl.ScriptHandler
import org.gradle.api.invocation.Gradle
import org.gradle.api.logging.Logger
import org.gradle.api.logging.LoggingManager
import org.gradle.api.model.ObjectFactory
import org.gradle.api.plugins.*
import org.gradle.api.provider.PropertyState
import org.gradle.api.provider.Provider
import org.gradle.api.provider.ProviderFactory
import org.gradle.api.resources.ResourceHandler
import org.gradle.api.tasks.TaskContainer
import org.gradle.api.tasks.WorkResult
import org.gradle.normalization.InputNormalizationHandler
import org.gradle.process.ExecResult
import org.gradle.process.ExecSpec
import org.gradle.process.JavaExecSpec
import java.io.File
import java.net.URI
import java.util.concurrent.Callable

class FakeProject : Project {

    private val extensionContainer = FakeExtensionContainer()

    override fun getProjectDir(): File = File("")

    override fun getExtensions(): ExtensionContainer = extensionContainer

    override fun getGroup(): Any {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun afterEvaluate(action: Action<in Project>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun afterEvaluate(closure: Closure<*>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getDefaultTasks(): MutableList<String> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getConvention(): Convention {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getLogger(): Logger {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getBuildDir(): File {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAnt(): AntBuilder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getVersion(): Any {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getRootProject(): Project {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun depthCompare(otherProject: Project): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getGradle(): Gradle {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAllTasks(recursive: Boolean): MutableMap<Project, MutableSet<Task>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun uri(path: Any): URI {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun copySpec(closure: Closure<*>): CopySpec {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun copySpec(action: Action<in CopySpec>): CopySpec {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun copySpec(): CopySpec {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun relativePath(path: Any): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setProperty(name: String, value: Any?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> property(clazz: Class<T>): PropertyState<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun property(propertyName: String): Any? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun beforeEvaluate(action: Action<in Project>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun beforeEvaluate(closure: Closure<*>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun buildscript(configureClosure: Closure<*>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getProject(): Project {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun dependencies(configureClosure: Closure<*>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getPath(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun zipTree(zipPath: Any): FileTree {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun allprojects(action: Action<in Project>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun allprojects(configureClosure: Closure<*>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> container(type: Class<T>): NamedDomainObjectContainer<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> container(type: Class<T>, factory: NamedDomainObjectFactory<T>): NamedDomainObjectContainer<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> container(type: Class<T>, factoryClosure: Closure<*>): NamedDomainObjectContainer<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun repositories(configureClosure: Closure<*>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun evaluationDependsOnChildren() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun configure(`object`: Any, configureClosure: Closure<*>): Any {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun configure(objects: MutableIterable<*>, configureClosure: Closure<*>): MutableIterable<*> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> configure(objects: MutableIterable<T>, configureAction: Action<in T>): MutableIterable<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun exec(closure: Closure<*>): ExecResult {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun exec(action: Action<in ExecSpec>): ExecResult {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun sync(action: Action<in CopySpec>): WorkResult {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun configurations(configureClosure: Closure<*>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getProperties(): MutableMap<String, *> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun absoluteProjectPath(path: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun files(vararg paths: Any?): ConfigurableFileCollection {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun files(paths: Any, configureClosure: Closure<*>): ConfigurableFileCollection {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun files(paths: Any, configureAction: Action<in ConfigurableFileCollection>): ConfigurableFileCollection {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hasProperty(propertyName: String): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getState(): ProjectState {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getComponents(): SoftwareComponentContainer {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setBuildDir(path: File) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setBuildDir(path: Any) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun defaultTasks(vararg defaultTasks: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun compareTo(other: Project?): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun artifacts(configureClosure: Closure<*>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun artifacts(configureAction: Action<in ArtifactHandler>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getRootDir(): File {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getDependencyLocking(): DependencyLockingHandler {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> provider(value: Callable<T>): Provider<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findProperty(propertyName: String): Any? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getDependencies(): DependencyHandler {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getResources(): ResourceHandler {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setDefaultTasks(defaultTasks: MutableList<String>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun normalization(configuration: Action<in InputNormalizationHandler>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun project(path: String): Project {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun project(path: String, configureClosure: Closure<*>): Project {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun project(path: String, configureAction: Action<in Project>): Project {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun task(name: String): Task {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun task(args: MutableMap<String, *>, name: String): Task {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun task(args: MutableMap<String, *>, name: String, configureClosure: Closure<*>): Task {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun task(name: String, configureClosure: Closure<*>): Task {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun task(name: String, configureAction: Action<in Task>): Task {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun copy(closure: Closure<*>): WorkResult {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun copy(action: Action<in CopySpec>): WorkResult {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getDescription(): String? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun subprojects(action: Action<in Project>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun subprojects(configureClosure: Closure<*>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getBuildscript(): ScriptHandler {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getStatus(): Any {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun mkdir(path: Any): File {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setStatus(status: Any) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getConfigurations(): ConfigurationContainer {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getArtifacts(): ArtifactHandler {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setDescription(description: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getLayout(): ProjectLayout {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun apply(closure: Closure<*>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun apply(action: Action<in ObjectConfigurationAction>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun apply(options: MutableMap<String, *>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun evaluationDependsOn(path: String): Project {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun javaexec(closure: Closure<*>): ExecResult {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun javaexec(action: Action<in JavaExecSpec>): ExecResult {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getChildProjects(): MutableMap<String, Project> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getLogging(): LoggingManager {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getTasks(): TaskContainer {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getName(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun file(path: Any): File {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun file(path: Any, validation: PathValidation): File {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findProject(path: String): Project? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getPlugins(): PluginContainer {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun ant(configureClosure: Closure<*>): AntBuilder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun ant(configureAction: Action<in AntBuilder>): AntBuilder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAllprojects(): MutableSet<Project> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createAntBuilder(): AntBuilder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getObjects(): ObjectFactory {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun dependencyLocking(configuration: Action<in DependencyLockingHandler>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun tarTree(tarPath: Any): FileTree {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(vararg paths: Any?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(action: Action<in DeleteSpec>): WorkResult {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getRepositories(): RepositoryHandler {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getTasksByName(name: String, recursive: Boolean): MutableSet<Task> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getParent(): Project? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getDisplayName(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun relativeProjectPath(path: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getPluginManager(): PluginManager {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setGroup(group: Any) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun fileTree(baseDir: Any): ConfigurableFileTree {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun fileTree(baseDir: Any, configureClosure: Closure<*>): ConfigurableFileTree {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun fileTree(baseDir: Any, configureAction: Action<in ConfigurableFileTree>): ConfigurableFileTree {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun fileTree(args: MutableMap<String, *>): ConfigurableFileTree {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getNormalization(): InputNormalizationHandler {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setVersion(version: Any) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getDepth(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getProviders(): ProviderFactory {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getSubprojects(): MutableSet<Project> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getBuildFile(): File {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}