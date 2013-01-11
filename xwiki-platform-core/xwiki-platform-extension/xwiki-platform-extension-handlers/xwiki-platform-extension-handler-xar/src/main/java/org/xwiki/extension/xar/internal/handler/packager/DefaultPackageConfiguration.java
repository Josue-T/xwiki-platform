/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.extension.xar.internal.handler.packager;

import java.util.HashSet;
import java.util.Set;

import org.xwiki.job.event.status.JobStatus;
import org.xwiki.model.reference.DocumentReference;

/**
 * @version $Id$
 * @since 4.0M2
 */
public class DefaultPackageConfiguration implements PackageConfiguration
{
    private String wiki;

    private DocumentReference user;

    private boolean interactive;

    private JobStatus jobStatus;

    private boolean logEnabled = false;

    private Set<String> entriesToImport;

    @Override
    public String getWiki()
    {
        return this.wiki;
    }

    public void setWiki(String wiki)
    {
        this.wiki = wiki;
    }

    @Override
    public DocumentReference getUserReference()
    {
        return this.user;
    }

    public void setUser(DocumentReference user)
    {
        this.user = user;
    }

    @Override
    public boolean isInteractive()
    {
        return this.interactive;
    }

    public void setInteractive(boolean interactive)
    {
        this.interactive = interactive;
    }

    @Override
    public JobStatus getJobStatus()
    {
        return this.jobStatus;
    }

    public void setJobStatus(JobStatus jobStatus)
    {
        this.jobStatus = jobStatus;
    }

    @Override
    public boolean isLogEnabled()
    {
        return this.logEnabled;
    }

    public void setLogEnabled(boolean logEnabled)
    {
        this.logEnabled = logEnabled;
    }

    @Override
    public Set<String> getEntriesToImport()
    {
        return this.entriesToImport;
    }

    public void setEntriesToImport(Set<String> entriesToImport)
    {
        this.entriesToImport = entriesToImport;
    }

    public void addEntry(String entry)
    {
        if (this.entriesToImport == null) {
            this.entriesToImport = new HashSet<String>();
        }

        this.entriesToImport.add(entry);
    }
}
