package project_euler.di;

import com.google.inject.Guice;
import com.google.inject.Injector;

public abstract class ProblemDi {

    protected Injector injector;

    public ProblemDi() {
        injector = Guice.createInjector(new ModuleDi());
    }
}
